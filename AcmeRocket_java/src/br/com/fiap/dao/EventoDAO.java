package br.com.fiap.dao;

import br.com.fiap.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.fiap.entity.Evento;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

public class EventoDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

//    public EventoDAO() {
//        conn = Conexao.getConnection();
//    }
    /**
     * Busca todos os eventos e retorna lista de eventos
     *
     * @return ArrayList<Evento>
     */
    public ArrayList listar() {
        ArrayList<Evento> lista = new ArrayList();

        try {
            conn = Conexao.getConnection();
            sql = "SELECT * FROM EVENTOS";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int codEvento = rs.getInt("COD_EVENTO");
                String nomeEvento = rs.getString("NOM_EVENTO");
                String localEvento = rs.getString("LOC_EVENTO");
                Date datEvento = rs.getDate("DAT_EVENTO");
                lista.add(new Evento(codEvento, nomeEvento, localEvento, datEvento));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar eventos! \n ERRO: " + ex);
        }

        return lista;
    }

    /**
     * Remove um evento do banco de dados
     *
     * @param codEvento
     * @return boolean
     */
    public boolean deletar(int codEvento) {
        boolean sucesso = false;
        try {
            conn = Conexao.getConnection();
            sql = "DELETE FROM EVENTOS WHERE COD_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codEvento);
            ps.execute();
            sucesso = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar eventos! \n ERRO: " + ex);
        }
        return sucesso;
    }

    /**
     * Persiste um evento no banco de dados
     *
     * @param evento
     * @return boolean
     */
    public boolean inserir(Evento evento) {
        int novoIndex = buscarIndex();
        boolean sucesso = false;
        try {
            conn = Conexao.getConnection();
            sql = "INSERT INTO EVENTOS (COD_EVENTO, NOM_EVENTO, LOC_EVENTO, DAT_EVENTO) VALUES(?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, novoIndex);
            ps.setString(2, evento.getNomEvento());
            ps.setString(3, evento.getLocEvento());
            ps.setDate(4, evento.getDatEvento());
            ps.execute();
            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir eventos! \n ERRO: " + ex);
        }
        return sucesso;
    }

    /**
     * Busca o ultimo maior valor de id e incrementa + 1
     *
     * @return int
     */
    public int buscarIndex() {
        int proximaColuna = 0;
        try {
            conn = Conexao.getConnection();
            sql = "SELECT MAX(COD_EVENTO) as max_linhas FROM EVENTOS";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                proximaColuna = rs.getInt("max_linhas") + 1;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar index: " + ex);
        }

        return proximaColuna;
    }

    /**
     * Retorna o evento respectivo ao ID passado por parametro
     *
     * @param codEvento
     * @return Evento
     */
    public Evento buscar(int codEvento) {
        Evento evento = null;
        try {
            conn = Conexao.getConnection();
            sql = "SELECT * FROM EVENTOS WHERE COD_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codEvento);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nomeEvento = rs.getString("NOM_EVENTO");
                String localEvento = rs.getString("LOC_EVENTO");
                Date dataEvento = rs.getDate("DAT_EVENTO");

                evento = new Evento(nomeEvento, localEvento, dataEvento);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar evento! \n ERRO: " + ex);
        }
        return evento;
    }

    /**
     * Edita um evento existente
     *
     * @param evento
     */
    public boolean alterar(Evento evento) {
        boolean aux = false;
        try {
            conn = Conexao.getConnection();
            sql = "UPDATE EVENTOS SET NOM_EVENTO = ?, LOC_EVENTO = ?, DAT_EVENTO = ? WHERE COD_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, evento.getNomEvento());
            ps.setString(2, evento.getLocEvento());
            ps.setDate(3, evento.getDatEvento());
            ps.setInt(4, evento.getCodEvento());
            ps.execute();
            aux = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar evento! \n ERRO: " + ex);
        }
        return aux;
    }

    public String buscarNomeEvento(int codigo) {
        String nomeEvento = "";
        try {

            conn = Conexao.getConnection();
            sql = "SELECT * FROM EVENTOS WHERE COD_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) {
                nomeEvento = rs.getString("NOM_EVENTO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do evento! \n ERROR: " + ex);

        }
        return nomeEvento;
    }

    public int buscarIdComboEvento(String evento) {
        int id = 0;
        try {

            conn = Conexao.getConnection();
            sql = "SELECT * FROM EVENTOS WHERE NOM_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, evento);

            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("COD_EVENTO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id do evento! \n ERROR: " + ex);
        }

        return id;

    }
    
    public boolean existeEvento(String nomeEvento) {
        Evento a = null;
        boolean valida = false;
        try {
            conn = Conexao.getConnection();
            sql = "SELECT * FROM EVENTOS WHERE NOM_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomeEvento);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                a = new Evento(rs.getInt("COD_EVENTO"),rs.getString("NOM_EVENTO"), rs.getString("LOC_EVENTO"), rs.getDate("DAT_EVENTO"));
                valida = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior cod evento: " + ex);
        }

        return valida;

    }

    public int verificarQuantidadeDependencia(int codEvento) {
        int qtdEventos = 0;
        try {
            conn = Conexao.getConnection();
            sql = "SELECT COUNT(*) qtd_evento FROM GRUPO WHERE EVENTOS_COD_EVENTO = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codEvento);
            rs = ps.executeQuery();

            while (rs.next()) {
                qtdEventos = rs.getInt("qtd_evento");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar quantidade de turmas dependentes: " + ex);
        }

        return qtdEventos;
    }
}

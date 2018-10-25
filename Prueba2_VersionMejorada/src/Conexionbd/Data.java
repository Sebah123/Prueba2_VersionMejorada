package Conexionbd;

import model.Hotel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("bd_trivago");
    }
    
    public void crearHotel(Hotel h) throws SQLException{
    String insert = "INSERT INTO hotel VALUES(NULL, "
            + "'"+h.getNombre()+"',"
            + "'"+h.getCiudad()+"',"
            + "'"+h.getPrecio_por_noche()+"')";
    con.ejecutar(insert);
    }
    
    
    
    
    public List<Hotel> listarPHotel(String filtro) throws SQLException{
        List<Hotel> lista1 = new ArrayList<>();
        
        String query = "SELECT * FROM hotel ORDER BY '"+filtro+"' DESC;";
        
        ResultSet rs = con.ejecutar(query);
        
        while(rs.next()){
            Hotel hot = new Hotel();
            
            hot.setId(rs.getInt(1));
            hot.setNombre(rs.getString(2));
            hot.setCiudad(rs.getString(3));
            hot.setPrecio_por_noche(rs.getInt(4));
            
            lista1.add(hot);
        }
        
        con.close();
        
        return lista1;
    }
    
    
     public List<Hotel> getHoteles(String filtro) throws SQLException {
        List<Hotel> lista = new ArrayList<>();
        
        String query1 = "SELECT * FROM hotel WHERE(nombre LIKE"
                + "'%"+filtro+ "%' OR ciudad LIKE '" +filtro+"')";
        
        ResultSet rs = con.ejecutar(query1);
        
        while (rs.next()) {
            Hotel hot = new Hotel();
            
            hot.setId(rs.getInt(1));
            
            hot.setNombre(rs.getString(2));
            
            hot.setCiudad(rs.getString(3));
            
            hot.setPrecio_por_noche(rs.getInt(4));
            
            lista.add(hot);
        }
        
        con.close();
        return lista;
    }
    
    
}


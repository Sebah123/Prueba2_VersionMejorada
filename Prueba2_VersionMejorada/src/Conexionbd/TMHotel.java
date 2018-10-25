package Conexionbd;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Hotel;

public class TMHotel extends AbstractTableModel {
    private List<Hotel> lista;
    
    public TMHotel(List<Hotel> lista){
        this.lista = lista;
    }

    public TMHotel(Class<? extends Data> listaHotels) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hotel hot = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return hot.getId();
            case 1:
                return hot.getNombre();
            case 2:
                return hot.getCiudad();
            default:
                return "$"+hot.getPrecio_por_noche();
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Ciudad";
            default:
                return "Precio";
        }
    }
    
    
}

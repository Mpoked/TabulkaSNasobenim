import javax.swing.table.AbstractTableModel;


public class CisloTableModel extends AbstractTableModel {
    private int cislo;
    private String[] columnNames = {"Násobek", "Výsledek"};

    public CisloTableModel(int cislo){
        this.cislo = cislo;
    }

    @Override
    public int getRowCount(){
        return 5;
    }

    @Override
    public int getColumnCount(){
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cislo cislo = new Cislo(this.cislo);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return cislo.getCislo() * (rowIndex + 1);
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }


}

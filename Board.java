
public class Board
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int rows;
    private int columns;
    private Piece[][] pieces;

    
    public Board(int rows, int columns)
    {
       this.rows = rows;
       this.columns = columns;
       pieces = new Piece[rows][columns];
    }

    
    public void setColumns(int columns)
    {
        this.columns = columns;
    }
    
    public int getColumns()
    {
        return columns;
    }
    
        public void setRows(int rows)
    {
        this.rows = rows;
    }
    
    public int getRows()
    {
        return rows;
    }
}
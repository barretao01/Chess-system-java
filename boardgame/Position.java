package boardgame;


public class Position
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int row;
    private int column;

    
    public Position(int row , int column)
    {
        this.row = row;
        this.column = column;
    
    }

   
    public void setColumn(int column)
    {
        this.column = column;
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public void setRow(int row)
    {
        this.row = row;
    }
    
    public int getRow()
    {
        return row;
    }
    
    @Override
    public String toString()
    {
        return row + ","+ column;
    }

    
}
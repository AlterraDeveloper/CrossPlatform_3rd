public class FictionLibrary extends Library implements IKeyWords{

    private String[] tickets;

    public FictionLibrary(){
        super(new String[5],new String[3]);
        tickets = new String[] {
            "0001",
            "0002",
            "0003",
            "0004"
        };
    }

    @Override
    public String giveOutBook(int id){
        return books[id];
    }

    @Override
    public String generateKeyWord(){
        return "123"+STUDENT_CODE;
    }
}

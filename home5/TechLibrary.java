public class TechLibrary extends Library implements IKeyWords{
    private String[] articles;
    private boolean isUniversity;

    public TechLibrary(){
        super();
        if(articles == null) isUniversity = false;
        else isUniversity = true;
    }

    @Override
    public String giveOutBook(int id){
        //return super.giveOutBook(id);
        return "123456";
    }

    @Override
    public String generateKeyWord(){
        if(isUniversity) return STUDENT_CODE;
        else return TEACHER_CODE;
    }

}

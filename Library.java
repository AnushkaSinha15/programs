class Library
{
    int acc_num;String title; String author; int charge; int days;
    void input(int accnum, String title_name, String author_name,int day_s)
    {
        acc_num=accnum;
        title= title_name;
        author=author_name;
        days=day_s;
    }
    void compute()
    {
        charge=days*2;
        System.out.println("the charge is: "+charge);
    }
    void display()
    {
        System.out.println("Accession Number    Title       Author");
        System.out.println(acc_num+"         " +title+"      "+author);
    }
    public static void main(String args[])
    {
        Library obj= new Library();
        obj.input(2165791,"The Alchemist","Paulo Coelho",10);
        obj.compute();
        obj.display();
    }
}
class Books {
    String title;
    String author;
}

public class BookTest{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "The grapes of java";
        myBooks[1].title = "Shallow Heart";
        myBooks[2].title = "Disordered Life";
        myBooks[0].author = "A. M. Hill";
        myBooks[1].author = "B. C. Jill";
        myBooks[2].author = "C.O. Doe";

        while(x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x += 1;
        }
    }
}

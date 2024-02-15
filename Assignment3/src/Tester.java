/*
 * This is a class I used to debug and make sure everything worked properly, so
 * I threw it in with the rest of the project. For the remove methods, I just
 * changed the value to whatever I wanted to test. For the generic classes,
 * I used objects of this class just for something to fill them with and show it works
 * with not books, though they work just as well when filled with Books still. 
 */
public class Tester 
{
	public static void main(String[] args)
	{
		AList alist = new AList();
		SLList single = new SLList();
		DLList dlist = new DLList();
		
		gen_AList genalist = new gen_AList();
		gen_SLList gensingle = new gen_SLList();
		gen_DLList gendouble = new gen_DLList();
		
		Book book0 = new Book("a", "b", 0.0);
		Book book1 = new Book("c", "d", 0.1);
		Book book2 = new Book("e", "f", 0.2);
		Book book3 = new Book("g", "h", 0.3);
		
		Tester test0 = new Tester();
		Tester test1 = new Tester();
		Tester test2 = new Tester();
		Tester test3 = new Tester();
		
		alist.listAdd(book0);
		alist.listAdd(book1);
		alist.listAdd(book2);
		alist.listAdd(book3);
		
		single.listAdd(book0);
		single.listAdd(book1);
		single.listAdd(book2);
		single.listAdd(book3);
		
		dlist.listAdd(book0);
		dlist.listAdd(book1);
		dlist.listAdd(book2);
		dlist.listAdd(book3);
		
		genalist.listAdd(test0);
		genalist.listAdd(test1);
		genalist.listAdd(test2);
		genalist.listAdd(test3); 
		
		gensingle.listAdd(test0);
		gensingle.listAdd(test1);
		gensingle.listAdd(test2);
		gensingle.listAdd(test3);
	
		gendouble.listAdd(test0);
		gendouble.listAdd(test1);
		gendouble.listAdd(test2);
		gendouble.listAdd(test3);
		
		//alist.listRemove(0);
		//single.listRemove(0);
		//dlist.listRemove(4);
		//genalist.listRemove(2);
		//gensingle.listRemove(-2);
		//gendouble.listRemove(-1);
		
		//System.out.println(alist.toString());
		//System.out.println(single.toString());
		//System.out.println(dlist.toString());
		//System.out.println(genalist.toString());
		//System.out.println(gensingle.toString());
		//System.out.println(gendouble.toString());

	}
}

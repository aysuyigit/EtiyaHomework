package hwEtiya;

public class main {

	public static void main(String[] args) {
		mylistArray list = new mylistArray();
		list.add("Ankara");
		list.add("İstanbul");
		list.add("Muğla");
		// list.delete(0);

		list.list();
		boolean result = list.contains("İstanbul");
		System.out.println(result);


	}

}

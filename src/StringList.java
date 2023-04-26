import java.util.ArrayList;

public class StringList extends ArrayList<String> {

    @Override
    public boolean add(String s) {
        if(s.toLowerCase().contains("otros datos")) return false;
        super.add(s);
        super.add(s);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("hola");
        strList.add("hola");
        strList.add("java");
        strList.add("java");
        System.out.println(strList);

        StringList strList1 = new StringList();
        strList1.add("hola");
        strList1.add("java");
        strList1.add("Yo tengo otros datos!");
        strList1.add("Yo tengo otra data");
        System.out.println(strList1);

    }
}

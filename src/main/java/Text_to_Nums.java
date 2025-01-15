import java.util.HashMap;

public class Text_to_Nums {

    public String example = "Three hundred eighty one thousand five hundred twenty one";

    public HashMap<String,Integer> mults = new HashMap<>();

    public HashMap<String,Integer> nums = new HashMap<>();

    public HashMap<String,Integer> tens = new HashMap<>();

    public Text_to_Nums() {
        mults.put("hundred", 100);
        mults.put("thousand", 1000);
        mults.put("million", 1000000);
        mults.put("billion", 1000000000);
    }

    public void read(String input){
        String[] words = input.split(" ");
    }
}

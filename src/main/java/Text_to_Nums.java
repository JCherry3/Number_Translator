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
        String in = input.toLowerCase();
        String[] words = in.split(" ");
        int len = words.length;
        if(!nums.containsKey(words[0])){
            System.out.println("Not a valid input");
            return;
        }
        for(int i = 0; i < words.length; i++){
            int output = 0;
            int count = 0;
            if(nums.containsKey(words[i])){
                if(len > i + 1){
                    output += mults.get(words[i + 1]) * nums.get(words[i]);
                    count++;
                }else{
                    output += nums.get(words[i]);
                }
                if(len > i + 2){
                    if(tens.containsKey(words[i + 2])){
                        output += tens.get(words[i + 2]);
                        count++;
                        if(len > i + 3 && nums.containsKey(words[i + 3])){
                            output += nums.get(words[i + 3]);
                            count++;
                        }
                    }else if(nums.containsKey(words[i + 2])){
                        output += nums.get(words[i + 2]);
                        count++;
                    }
                }
                System.out.print(output);
                System.out.print(",");
                i += count;
            }
        }
    }
}

import java.util.HashMap;

public class Text_to_Nums {

    public String example = "Three hundred eighty one thousand five hundred twenty one";

    public HashMap<String,Integer> mults = new HashMap<>();

    public HashMap<String,Integer> nums = new HashMap<>();

    public Text_to_Nums() {
        mults.put("thousand", 1);
        mults.put("million", 1);
        mults.put("billion", 1);
        mults.put("trillion", 1);
        mults.put("quadrillion", 1);
        mults.put("quintillion", 1);
        mults.put("sextillion", 1);
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);
        nums.put("five", 5);
        nums.put("six", 6);
        nums.put("seven", 7);
        nums.put("eight", 8);
        nums.put("nine", 9);
        nums.put("ten", 10);
        nums.put("eleven", 11);
        nums.put("twelve", 12);
        nums.put("thirteen", 13);
        nums.put("fourteen", 14);
        nums.put("fifteen", 15);
        nums.put("sixteen", 16);
        nums.put("seventeen", 17);
        nums.put("eighteen", 18);
        nums.put("nineteen", 19);
        nums.put("twenty", 20);
        nums.put("thirty", 30);
        nums.put("forty", 40);
        nums.put("fifty", 50);
        nums.put("sixty", 60);
        nums.put("seventy", 70);
        nums.put("eighty", 80);
        nums.put("ninety", 90);
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
                if(len > i + 1 && !mults.containsKey(words[i + 1])){
                    output += nums.get(words[i + 1]) * 100;
                    count++;
                }else{
                    output += nums.get(words[i]);
                }
                if(len > i + 2){
                    if(nums.containsKey(words[i + 2])){
                        output += nums.get(words[i + 2]);
                        count++;
                        if(len > i + 3 && nums.containsKey(words[i + 3])){
                            output += nums.get(words[i + 3]);
                            count++;
                        }
                    }
                }
                System.out.print(output);
                System.out.print(",");
                i += count;
            }
        }
    }
}

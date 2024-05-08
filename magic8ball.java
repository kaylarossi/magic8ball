
import java.util.Random;
import java.util.List;
import java.util.Arrays;
class magic8ball {
    public static void main(String[] args) {
    List<String> responses = Arrays.asList("It is certain","It is decidedly so", "Without a doubt","Yes definitely","You may rely on it","As I see it, yes","Most likely","Outlook good","Yes","Signs point to yes","Reply hazy, try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again","Don't count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful");
    Random rand = new Random();
    int rand_val = rand.nextInt(responses.size());
    
        
        System.out.println(responses.get(rand_val));
    }
}

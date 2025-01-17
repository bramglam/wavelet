import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class SearchHandler implements URLHandler{

    ArrayList<String> searchOutput = new ArrayList<String>();
    
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Number: %d", num);
        } else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    num += Integer.parseInt(parameters[1]);
                    return String.format("Number increased by %s! It's now %d", parameters[1], num);
                }
            }
            return "404 Not Found!";
        }
    }

    public String handleRequest2(URI url){
        if(url.getPath().equals("/")){


        } else if (url.getPath().equals("add")){


        } else if (url.getPath().equals("search")){

        } else {
            return "404 Not Found";
        }
    }
    


}




public class SearchEngine {

    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        //After running command what was put in after it

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }

    
}


//Ran on local server
//Scp java files 
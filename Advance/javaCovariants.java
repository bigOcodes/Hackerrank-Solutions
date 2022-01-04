import java.io.BufferedReader;
import java.io.InputStreamReader;

class Flower{
    String whatYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    String whatYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatYourName(){
        return "Lily";
    }
}

class Region{
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class AndhraPradesh extends Region{
    @Override
    Flower yourNationalFlower(){
        return new Lily();
    }
}

class WestBengal extends Region{
    @Override
    Flower yourNationalFlower(){
        return new Jasmine();
    }
}

public class javaCovariants {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String loc = br.readLine().trim();

        Region region = null;
        switch (loc) {
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            case "WestBengal":
                region = new WestBengal();
                break;
            default:
                break;
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatYourName());
    }
}

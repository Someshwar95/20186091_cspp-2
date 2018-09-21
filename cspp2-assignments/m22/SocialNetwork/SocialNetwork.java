import java.util.*;
class SocialNetwork {
    private Map<String, ArrayList<String>> network;
    SocialNetwork() {
        network = new HashMap<String, ArrayList<String>>();
    }
    public ArrayList<String> getCommonConnections(String person1, String person2) {
        ArrayList<String> commonconnection = new ArrayList<String>();
        for (String name: network.get(person1)) {
            if (network.get(person2).contains(name)) {
                commonconnection.add(name);
                }
            }   
        return commonconnection;
    }
    public ArrayList<String> getConnections(String usern) {
        if (network.containsKey(usern)) {
            return network.get(usern);
        }
        return null;
    }
    public void addConnections(String username, String[] follow) {
        
        ArrayList<String> addpeople = new ArrayList<String>(Arrays.asList(follow));
        network.putIfAbsent(username, addpeople);
    }
    public void addConnections(String username, String follow) {
        for(String key: network.keySet()) {
            if(key.equals(username)) {
                network.get(key).add(follow);
            }
            network.putIfAbsent(username, new ArrayList<String>(Arrays.asList(follow.split(" "))));
        }
    }
    public void showNetwork() {
        Map<String, ArrayList<String>> sortmap = new TreeMap<String, ArrayList<String>>(network);
        String str = "";
        for (Map.Entry<String, ArrayList<String>> map: sortmap.entrySet()) {

                str += map.getKey() + ": "+ map.getValue()+", ";
        }
        System.out.println(str.substring(0, str.length()-2));
    } 
}

public final class Solution {

    public static void main(final String[] args) {

        Scanner sc =  new Scanner(System.in);
        SocialNetwork socialnet = new SocialNetwork();
        while (sc.hasNext()) {
            String line = sc.nextLine();

            String[] token = line.replace(".","").split(" is connected to ");
            String [] condition = token[0].split(" ");

            if(token.length == 2 || condition[0].equals("addConnections")) {
                if (!condition[0].equals("addConnections")) {
                    socialnet.addConnections(token[0], token[1].split(", "));
                } else {
                    socialnet.addConnections(condition[1], condition[2]);
                }
            } else {
                if (condition[0].equals("getConnections")) {
                    System.out.println(socialnet.getConnections(condition[1]));
                } else if (condition[0].equals("CommonConnections")) {
                    System.out.println(socialnet.getCommonConnections(condition[1], condition[2]));
                } else if(condition[0].equals("Network")) {
                    socialnet.showNetwork();
                }
            }

        }
    }
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {
    private static List<List<String>> securities = new ArrayList<>();

    public int getNumberOfSecurities(){
        return securities.size();
    }

//    public String getSecurityInfo(int clientNumber){
//        String text = "";
//        Iterator<List<String>> it = securities.iterator();
//        it.next();
//        while (it.hasNext()) {
//            List<String> record = it.next();
//
//            Iterator<String> field = record.iterator();
//            while (field.hasNext()) {
//                String str = field.next();
//                text += str + " ";
//            }
//
//            text += "\n";
//        }
//
//
//
//        String text = "";
//        text += "Name: " + c.getName() + "\n";
//        text += "Funds: " + c.getFunds() + "\n";
//        return text;
//    }

    public String getListOfSecurities(){
        String text = "";
        Iterator<List<String>> it = securities.iterator();
        it.next();
        while (it.hasNext()){
            List<String> record = it.next();

            Iterator<String> field = record.iterator();
            while (field.hasNext()){
                String str = field.next();
                text += str + " ";
            }

            text += "\n";
        }

        return text;
    }

//    public boolean deposit(String clientName, int amount) {
//        Iterator<Client> it = clients.iterator();
//        boolean found = false;
//        while (it.hasNext()){
//            Client c = it.next();
//            if (c.getName().equals(clientName)){
//                found = true;
//                c.deposit(amount);
//            }
//        }
//        return found;
//    }
}

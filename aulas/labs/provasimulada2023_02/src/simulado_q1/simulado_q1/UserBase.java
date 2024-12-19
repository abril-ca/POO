package simulado_q1;
import java.util.*;

public class UserBase
{
    private Map<String, User> users;

    public UserBase()
    {
        this.users = new HashMap<>();
    }

    public User createUser(String id)
    {
        User u = new User(id);
        users.put(id, u);
        return u;
    }

    public void addUser(User u)
    {
        this.users.put(u.getTwitterId(), u);
    }

    public VerifiedUser createVerifiedUser(String id, Date date)
    {
        VerifiedUser vu = new VerifiedUser(id, date);
        users.put(id, vu);
        return vu;
    }

    public double porcentagemVerificados()
    {
        if (this.users.isEmpty()){
            return 0.0;
        }
        int cont = 0;
        for (User user : users.values()){
            if (user instanceof VerifiedUser){
                cont++;
            }
        }
        return (double)cont * 100 / users.size();
    }

    public double tamanhoMedioTweets() {
        if (users.isEmpty()){
            return 0.0;
        }

        int nLetras = 0;
        int nTweets = 0;

        for (User u : users.values()){
            LinkedList<Tweet> tweets = u.getTweets();
            for (Tweet t : tweets){
                nLetras += t.getMensagem().length();
                nTweets++;
            }
        }

        return (double)nLetras / nTweets;
    }

    public void printUsers()
    {
        for (User u : users.values()){
            System.out.println(u.getTwitterId());
        }
    }

}
package simulado_q1;
import java.util.*;

public class VerifiedUser extends User
{
    private Date verifiedDate;

    public VerifiedUser(String twitterId, Date date)
    {
        super(twitterId);
        this.verifiedDate = date;
    }

    public Date getVerifiedDate()
    {
        return this.verifiedDate;
    }
}
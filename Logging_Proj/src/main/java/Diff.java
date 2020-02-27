import org.apache.logging.log4j.LogManager;

public class Diff {
	private static final org.apache.logging.log4j.Logger sree =LogManager.getLogger(Diff.class);
public double variation(String s,Double e,String aut)
{
	if(s.equals("SM"))
	{
		sree.debug(1200*e);
		sree.info(1200*e);
		return(1200*e);
	}
	else if(s.equals("ASM"))
	{
		sree.debug(1500*e);
		sree.info(1500*e);
		return(1500*e);
	}
	else 
	{
		if(aut.equals("FAH"))
		{
			sree.debug(2500*e);
			sree.info(2500*e);
			return(2500*e);
		}
		else
		{
			sree.debug(1800*e);
			sree.info(1800*e);
			return(1800*e);
		}	
	}	
}	
}
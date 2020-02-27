import org.apache.logging.log4j.LogManager;

public class base {
	private static final org.apache.logging.log4j.Logger Sree =LogManager.getLogger(base.class);

	double amo,in,per;
	base(double amo,double in,double per)
	{
		this.amo=amo;
		this.in=in;
		this.per=per;
	}
	public double si()
	{  Sree.debug((amo*in*per)/100);
		Sree.info((amo*in*per)/100);
		return((amo*in*per)/100);
	}
	public double ci()
	{
		Sree.debug((amo*(Math.pow(1+(in/100), per))));
		Sree.info((amo*(Math.pow(1+(in/100), per))));
	return ((amo*(Math.pow(1+(in/100), per))));	
	}
	}
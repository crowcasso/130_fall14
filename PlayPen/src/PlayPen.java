/**	
 *	How	many	playpen	balls	would	it	take	to	fill	an	apartment?	
 *		
 *	@author	PARTNER_1	and	PARTNER_2	
 */	
public	class	PlayPen	{	
	private static	final double cubicInchPerCubicFoot	=	1728.0;	
	private static	final double packingEfficiency	=	64.0;		//	percent	
	private	static	final double floorArea	=	674.0;			 //	sq	feet	
	private	static	final double depthOfBalls	=	2.0;		 //	feet	
	private	static	final double radiusOfEachBall	=	1.675;		 //	inches	

	public	static	void	 main(String	[]	args)	{	
		
		double roomVolume = floorArea * depthOfBalls;
		double usableVolume = roomVolume * (packingEfficiency/100.0);
		double ballVolume = (4.0/3.0) * Math.PI * Math.pow(radiusOfEachBall, 3);
		double usableVolumeInches = usableVolume * cubicInchPerCubicFoot;
		double numBalls = usableVolumeInches / ballVolume;
		
		System.out.println(numBalls + " number of balls");
	}	
}





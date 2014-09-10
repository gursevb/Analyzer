public class Analyzer
	{
	static int totalCount;
	static int totalCountqqq;
	static int totalBegg;

	public static void main(String[] args)
		{
		printRecordNumber();
		printqNumber();
		printgNumber();
		printSix();
		}

	public static void printRecordNumber()
		{
		Data.addData();
		System.out.println(" There are " + Data.data.size()
				+ " records in this database.");
		}

	public static void printqNumber()
		{
		int counterTotalqs = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().contains("qqq"))
				{
				counterTotalqs = counterTotalqs + 1;
				}
			}
		System.out.println(" There are " + counterTotalqs
				+ " occurances of \"qqq\" in the data. ");
		}

	public static void printgNumber()
		{
		double counterTotalgs = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().substring(0,1).equals("g"))
				{
				counterTotalgs = counterTotalgs + 1;
				}
			}
		System.out.println(" There are " + counterTotalgs
				+ " records beggining with letter \"g\"");
		System.out.println(" That is " + counterTotalgs/Data.data.size()*100 + " % of records." );
		}
	public static void printSix()
		{
		int counterNumberSix = 0;
		for (int i = 0; i < Data.data.size(); i++)
			{
			if (Data.data.get(i).getLetterCode().length() ==6)
				{
				counterNumberSix = counterNumberSix + 1;
				}
		
			}
		System.out.println(" There are " + counterNumberSix + " lettercodes of length six.");
		}
	}
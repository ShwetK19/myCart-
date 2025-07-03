package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVReader
{
	    public static Iterator<Object[]> readCSV(String filepath)
	    {
	        List<Object[]> data = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
	        {
	            String line;
	            boolean firstLine = true;
	            while ((line = br.readLine()) != null)
	            {
	                if (firstLine) {
	                    firstLine = false; // Skip header
	                    continue;
	                }
	                String[] parts = line.split(",", -1);

	                if (parts.length >= 2)
	                {
	                    data.add(new Object[] { parts[0].trim(), parts[1].trim() });
	                }
	            }
	        }

	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }

	        return data.iterator();
	    }
}



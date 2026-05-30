import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter {

    public static void exportResults(
            List<VM> rrVMs,
            List<VM> eaVMs
    ) {

        try {

            FileWriter writer = new FileWriter("results.csv");

            // Header
            writer.write("Algorithm,TotalEnergy,TotalLoad,Makespan\n");

            // Round Robin
            writer.write(
                    "RoundRobin," +
                            Metrics.totalEnergy(rrVMs) + "," +
                            Metrics.totalLoad(rrVMs) + "," +
                            Metrics.makespan(rrVMs) + "\n"
            );

            // Energy Aware
            writer.write(
                    "EnergyAware," +
                            Metrics.totalEnergy(eaVMs) + "," +
                            Metrics.totalLoad(eaVMs) + "," +
                            Metrics.makespan(eaVMs) + "\n"
            );

            writer.close();

            System.out.println("\nCSV file created: results.csv");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
            e.printStackTrace();
        }
    }
}
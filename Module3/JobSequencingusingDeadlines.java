package Module3;

import java.util.Arrays;

public class JobSequencingusingDeadlines{

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void scheduledJobs(Job[] jobs){
        int n = jobs.length;
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean[] slots = new boolean[n];
        int[] jobSequence = new int[n];
        for (int i=0; i<n; i++){
            slots[i] = false;
        }
        int totalProfit = 0;
        for (int i=0; i<n; i++){
            for (int j=Math.min(n, jobs[i].deadline)-1; j >= 0; j--){
                if (!slots[j]){
                    slots[j] = true;
                    jobSequence[j] = jobs[i].id;
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }
        System.out.println("Job sequence to maximum profit: ");
        for (int i=0; i<n; i++){
            if (slots[i]){
                System.out.println(jobSequence[i]+" ");
            }
        }
        System.out.println("\nTotal profit: "+totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
          new Job(1, 2, 100),
          new Job(2, 1, 75),
          new Job(3, 1, 80),
          new Job(4, 1, 75),
          new Job(5, 3, 90)
        };
        scheduledJobs(jobs);
    }
}

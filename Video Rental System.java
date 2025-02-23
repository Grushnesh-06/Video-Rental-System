import java.util.*;

public class exp2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 100;

        int[] videoId = new int[n];
        String[] title = new String[n];
        String[] genre = new String[n];
        boolean[] isRented = new boolean[n];

        int i = 0; //videoCount

        while(true){
            System.out.println("Video Inventory Management System");
            System.out.println("1. Add new Video");
            System.out.println("2. Mark Video as Rented");
            System.out.println("3. Mark Video as Returned");
            System.out.println("4. Remove Video from Inventory");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    if(i < n){
                        System.out.print("Enter the Video Id:");
                        videoId[i] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the Title of the Video:");
                        title[i] = sc.nextLine();
                        System.out.print("Enter the Genre of the Video:");
                        genre[i] = sc.nextLine();
                        isRented[i] = false;
                        i++;
                        System.out.println("Video is added to Inventory");
                    }
                    else{
                        System.out.println("Inventory is full");
                    }
                    break;
                case 2:
                    System.out.print("Enter Video Id to Rent:");
                    int rentId = sc.nextInt();
                    boolean found = false;
                    for(int j=0; j<n; j++){
                        if(videoId[j] == rentId && !isRented[j]){
                            isRented[j] = true;
                            System.out.println("Video marked as Rented\n");
                            found = true;
                            break;
                        }
                    }   
                    if(!found){
                        System.out.println("Video is not found or is already Rented\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter Video Id to marked as Returned:");
                    int returnId = sc.nextInt();
                    found = false;
                    for(int j=0; j<n; j++){
                        if(videoId[j] == returnId && isRented[j]){
                            isRented[j] = false;
                            System.out.println("Video marked as Returned:\n");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Video not found or currently not Rented:\n");
                    }   
                    break;
                case 4:
                    System.out.println("Enter Video Id to remove from Inventory:");
                    int removeId = sc.nextInt();
                    found = false;
                    for(int j=0; j<n; j++){
                        if(videoId[j] == removeId){
                            for(int k=i; k<n-1; k++){
                                videoId[k] = videoId[k+1];
                                title[k] = title[k+1];
                                genre[k] = genre[k+1];
                               isRented[k] = isRented[k+1];
                            }
                            i--;
                            System.out.println("Video is removed from Inventory\n");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Video not found");
                    }
                    break;
                case 5:
                    System.out.println("Videos in Inventory");
                    System.out.printf("%-10s %-30s %-20s %-10s\n", "Video ID", "Video Title", "Video Genre", "Status");
                    if(i==0){
                        System.out.println("Inventory has no videos\n");
                    }
                    else{
                        for(int j=0; j<i; j++){
                            String status = isRented[j]?"Rented":"Available";
                            System.out.printf("%-10d %-30s %-20s %-10s\n", videoId[j], title[j], genre[j], status);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the system");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
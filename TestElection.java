/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testelection;

import com.mycompany.testelection.election.Election;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admir
 */
public class TestElection {

    public static void main(String[] args) {
        
        
        String arrayLength = JOptionPane.showInputDialog("Enter array length");
        
        Election[] election = new Election[Integer.parseInt(arrayLength)];

        double totalVotes = 0;
        String nameOfTheWinner = "";
        int determineTheWinner = 0;
        
        for(int x=0; x< election.length; x++){
            String candidate = JOptionPane.showInputDialog("Enter the candidate");
            String numVotes = JOptionPane.showInputDialog("Enter number of votes for candidate");
            
            totalVotes += Integer.parseInt(numVotes);
            
            if (Integer.parseInt(numVotes) > determineTheWinner){
                determineTheWinner = Integer.parseInt(numVotes);
                nameOfTheWinner = candidate;
            }
            
            election[x] = new Election(candidate,Integer.parseInt(numVotes));

        }
        
        System.out.printf("%-15s %-10s %-10s\n", "Candidate", "Votes", "% of Total Votes");
        for (Election election1 : election) {
            double percentagePerCandidate = Math.round(((election1.getNumVotes() / totalVotes) * 100) * 100.0) / 100.0; // Round to two decimal
            System.out.printf("%-15s %-10s %-10s\n", election1.getCandidate(), election1.getNumVotes(), percentagePerCandidate);
        }
        
        System.out.println();
        System.out.println("Total Votes: " + totalVotes);
        System.out.println("Winner of election is: " + nameOfTheWinner);
        
        ArrayList<String> namesOfCandidateWithHighestVotes = new ArrayList<>();

        for(Election election1 : election) {
            if(election1.getNumVotes() >= 4000) {
                namesOfCandidateWithHighestVotes.add(election1.getCandidate());
            }
        }
        
        JFrame displayFrame;
        displayFrame = new JFrame();
        JOptionPane.showMessageDialog(displayFrame, "Names of candidates with votes equal or greater than 4000: " + namesOfCandidateWithHighestVotes);
    }
}

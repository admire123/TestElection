/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testelection.election;

public class Election {
    public String candidate;
    public int numVotes;

    public Election(String candidate, int numVotes) {
        this.candidate = candidate;
        this.numVotes = numVotes;
    }

    public Election() {
    }

    public String getCandidate() {
        return candidate;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public int setNumVotes() {
        return numVotes;
    }

    @Override
    public String toString() {
        return "Election{" + "candidate=" + candidate + ", numVotes=" + numVotes + '}';
    }
    
    
}

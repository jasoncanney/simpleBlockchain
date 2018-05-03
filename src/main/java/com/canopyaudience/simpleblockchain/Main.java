/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canopyaudience.simpleblockchain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jason
 */
public class Main {
    /**
     *  Hash = Digital Signature
     * Each block will have:
     * List of transactions
     * Previous Hash
     * Hash
     * @param args
     */
    
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) {
        
        String[] genesisTransactions = {"AdImpression:0", "AdID:0"};
        Block genesisBlock = new Block(1973, genesisTransactions);
        
        String[] block2Transactions = {"AdCreated:04/08/18", "AdID:8675310", "AdOwner:Ford"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        
        String[] block3Transactions = {"AdImp:12312", "AdID:8675310", "AdOwner:Ford", 
            "PlacementOwner:Canoe", "ImpressionURL:http://bitly.co/123"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
      
        // Genesis Block
        System.out.print("Transactions of genesis block: ");
        System.out.println(genesisBlock.getTransactions());
        System.out.print("Previous Hash of genesis block: ");
        System.out.println(genesisBlock.getPreviousHash());
        System.out.print("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());
        
        // Block2 Block
        System.out.print("Transactions of block2 block: ");
        System.out.println(block2.getTransactions());
        System.out.print("Previous Hash of block2 block: ");
        System.out.println(block2.getPreviousHash());
        System.out.print("Hash of block2 block: ");
        System.out.println(block2.getBlockHash());

         // Block3 Block
        System.out.print("Transactions of block3 block: ");
        System.out.println(block3.getTransactions());
        System.out.print("Previous Hash of block3 block: ");
        System.out.println(block3.getPreviousHash());
        System.out.print("Hash of block3 block: ");
        System.out.println(block3.getBlockHash());
        
        
    }
    
}

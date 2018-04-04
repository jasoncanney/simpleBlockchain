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
        /*
        String[] list1 = {"a","b","c"};
        String[] list2 = {"aa","b","c"};
        
        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
        */
        
        String[] genesisTransactions = {"Jason was sent 10000 bitcoins by John", "John received 2 bitcoins from Jason"};
        Block genesisBlock = new Block(1973, genesisTransactions);
        
        String[] block2Transactions = {"Hi there second block", "Hi back second block"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        
        String[] block3Transactions = {"Hi there third block", "Hi back third block"};
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

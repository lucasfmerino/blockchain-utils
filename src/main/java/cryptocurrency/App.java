package cryptocurrency;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<String> transactions = new ArrayList<>();

        transactions.add("aa");
        transactions.add("bb");
        transactions.add("dd");

        MerkleTree merkleTree = new MerkleTree(transactions);

        System.out.println(merkleTree.getMerkleRoot());
    }
}
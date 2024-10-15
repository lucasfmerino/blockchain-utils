package blockchain;

public class App
{
    public static void main(String[] args)
    {
        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();

        Block genesisBlock = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(genesisBlock, blockChain);

        Block block1 = new Block(1, "transaction1",
                blockChain.getBlockChain().get(blockChain.getSize()-1).getHash());
        miner.mine(block1, blockChain);

        Block block2 = new Block(2, "transaction2",
                blockChain.getBlockChain().get(blockChain.getSize()-1).getHash());
        miner.mine(block2, blockChain);


        System.out.println("\n" + "BLOCKCHAIN:\n" + blockChain);
        System.out.println("blockchain.Miner's reward: " + miner.getReward());
    }
}

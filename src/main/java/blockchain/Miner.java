package blockchain;

public class Miner
{
    private int reward;


    public void mine(Block block, BlockChain blockChain)
    {
        while(!isGoldenHash(block))
        {
            block.incrementNonce();
            block.generateHash();
        }

        System.out.println(block + " has just mined...");
        System.out.println("Hash is: " + block.getHash());

        blockChain.addBlock(block);
        reward += Constants.REWARD;
    }


    private boolean isGoldenHash(Block block)
    {
        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
        return block.getHash().substring(0, Constants.DIFFICULTY).equals(leadingZeros);
    }


    public int getReward()
    {
        return this.reward;
    }

}

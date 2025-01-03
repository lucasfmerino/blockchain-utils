# Blockchain Utils

## Overview
The **Blockchain Utils** project demonstrates the implementation of basic blockchain and cryptocurrency concepts, including block creation, mining, and the use of cryptographic hashing. It also includes a basic Merkle Tree implementation for transaction management.

This project is implemented in **Java 21**, showcasing fundamental principles of blockchain technology in a modular and easy-to-understand structure.

---

## Features
- **Blockchain Implementation**:
    - Block creation and linkage.
    - Mining using Proof of Work.
- **Cryptographic Hashing**:
    - SHA-256 algorithm for secure hash generation.
- **Transaction Management**:
    - Basic Merkle Tree implementation.
- **Constants Configuration**:
    - Adjustable difficulty and reward system.

---

## Directory Structure
```plaintext
blockchain-utils/
├── pom.xml                     # Maven project file
└── src/
    ├── main/
    │   ├── java/
    │   │   ├── blockchain/     # Core blockchain implementation
    │   │   └── cryptocurrency/ # Cryptocurrency-specific features
    │   └── notes/              # Supplementary notes
    └── test/                   # Test files
```

---

## Technology Stack
- **Java**: Version 21.
- **Maven**: Dependency management and build tool.

---

## Getting Started

### Prerequisites
- **Java 21**
- **Maven**

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/blockchain-utils.git
   cd blockchain-utils
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="blockchain.App"
   ```

---

## Components

### **Blockchain**
- **Block**: Represents a single block in the blockchain.
- **BlockChain**: Manages the list of blocks.
- **Miner**: Mines new blocks by solving a cryptographic puzzle.
- **SHA256Helper**: Generates secure hashes using the SHA-256 algorithm.

### **Cryptocurrency**
- **MerkleTree**: Constructs a Merkle Tree from a list of transactions and computes the Merkle root.
- **CryptographyHelper**: Provides cryptographic utilities for hashing.

### **Constants**
Adjustable constants in `Constants.java`:
- **Difficulty**: Number of leading zeros required in a valid hash.
- **Reward**: Mining reward for each successfully mined block.
- **Genesis Previous Hash**: The default hash for the genesis block.

---

## Example Output
Sample output when running the application:
```plaintext
blockchain.Block [id=0, hash=0000017e5f3..., previousHash=000000000..., transaction=null] has just mined...
Hash is: 0000017e5f3...

blockchain.Block [id=1, hash=00000ab3c9d..., previousHash=0000017e5f3..., transaction=transaction1] has just mined...
Hash is: 00000ab3c9d...

blockchain.Block [id=2, hash=00000cd6e8f..., previousHash=00000ab3c9d..., transaction=transaction2] has just mined...
Hash is: 00000cd6e8f...

BLOCKCHAIN:
blockchain.Block [id=0, hash=0000017e5f3..., transaction=null]
blockchain.Block [id=1, hash=00000ab3c9d..., transaction=transaction1]
blockchain.Block [id=2, hash=00000cd6e8f..., transaction=transaction2]

blockchain.Miner's reward: 30
```

---

## Notes
Additional documentation on blockchain theory is provided in:
```plaintext
src/main/java/notes/summary.md
```
This includes:
- Blockchain data structures.
- SHA-256 hashing.
- Proof of Work (PoW) and Proof of Stake (PoS).
- Decentralized and distributed networks.

---

## Testing
- Unit tests can be added in the `src/test/java` directory.
- Run tests using Maven:
  ```bash
  mvn test
  ```

---

## License
This project is currently not licensed. Contact the author for permissions.

---

## Contact
For inquiries or suggestions, reach out to:
- **Email**: [hivetron.dev@gmail.com](mailto:hivetron.dev@gmail.com)

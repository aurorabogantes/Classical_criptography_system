# Classical Cryptography System with Modular Arithmetic

This repository demonstrates a classical cryptography system built on modular arithmetic. The system encrypts and decrypts text using a custom alphabet (which includes uppercase letters, numbers, and space), applying additive and multiplicative inverse operations for encryption and decryption.

## Features

- **Custom Alphabet**: The system uses a predefined alphabet containing uppercase letters (A-Z), digits (0-9), and space (total of 38 characters).
- **Encryption Process**: The encryption process involves two operations:
  1. **Additive Operation**: Each character is mapped to a number, then added with a constant, followed by a multiplicative step.
  2. **Multiplicative Operation**: The result is multiplied by a constant value and then taken modulo 38.
- **Decryption Process**: The decryption reverses the encryption by applying the inverse of the operations used during encryption.
- **Modular Arithmetic**: All operations are performed with modulo 38 to ensure the result stays within the bounds of the alphabet.
- **Educational Tool**: This project serves as an educational demonstration of classical cryptographic techniques and modular arithmetic.

## Getting Started

Follow these steps to use the cryptography system:

### Prerequisites
- Java environment (e.g., JDK or IDE like IntelliJ IDEA or Eclipse) to compile and run the project.

### Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/aurorabogantes/Classical-cryptography-system.git

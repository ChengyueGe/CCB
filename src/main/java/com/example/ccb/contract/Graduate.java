package com.example.ccb.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.5.
 */
@SuppressWarnings("rawtypes")
public class Graduate extends Contract {
    private static final String BINARY = "{\n"
            + "\t\"generatedSources\": [],\n"
            + "\t\"linkReferences\": {},\n"
            + "\t\"object\": \"60806040526000805534801561001457600080fd5b50610c2b806100246000396000f3fe608060405234801561001057600080fd5b50600436106100935760003560e01c8063680f20a111610066578063680f20a1146101585780639982cdb614610174578063b500ce9d146101a5578063d7920b38146101c3578063e314bd3d146101f357610093565b8063119e291d146100985780633f20b1f1146100c85780634a02e977146100f85780634df86bf114610128575b600080fd5b6100b260048036038101906100ad91906108cb565b610223565b6040516100bf9190610ad0565b60405180910390f35b6100e260048036038101906100dd91906108cb565b610274565b6040516100ef9190610ad0565b60405180910390f35b610112600480360381019061010d9190610937565b6102c5565b60405161011f9190610a7e565b60405180910390f35b610142600480360381019061013d9190610937565b610397565b60405161014f9190610a7e565b60405180910390f35b610172600480360381019061016d91906108cb565b610469565b005b61018e600480360381019061018991906109b6565b61053a565b60405161019c929190610a99565b60405180910390f35b6101ad61068e565b6040516101ba9190610ad0565b60405180910390f35b6101dd60048036038101906101d891906108cb565b610694565b6040516101ea9190610ad0565b60405180910390f35b61020d60048036038101906102089190610937565b6106e5565b60405161021a9190610a7e565b60405180910390f35b60018280516020810182018051848252602083016020850120818352809550505050505081805160208101820180518482526020830160208501208183528095505050505050600091509150505481565b60028280516020810182018051848252602083016020850120818352809550505050505081805160208101820180518482526020830160208501208183528095505050505050600091509150505481565b6000806001836040516102d89190610a67565b9081526020016040518091039020905060008482876040516102fa9190610a67565b90815260200160405180910390205410156103155784610334565b81866040516103249190610a67565b9081526020016040518091039020545b90508082876040516103469190610a67565b908152602001604051809103902081905550603c82876040516103699190610a67565b908152602001604051809103902054101561038957600092505050610390565b6001925050505b9392505050565b6000806002836040516103aa9190610a67565b9081526020016040518091039020905060008482876040516103cc9190610a67565b90815260200160405180910390205410156103e75784610406565b81866040516103f69190610a67565b9081526020016040518091039020545b90508082876040516104189190610a67565b908152602001604051809103902081905550603c828760405161043b9190610a67565b908152602001604051809103902054101561045b57600092505050610462565b6001925050505b9392505050565b600082511161047757600080fd5b600081511161048557600080fd5b600073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614156104bf57600080fd5b6000808154809291906001019190505550604051806040016040528083815260200182815250600460008054815260200190815260200160002060008201518160000190805190602001906105159291906107b7565b5060208201518160010190805190602001906105329291906107b7565b509050505050565b6004602052806000526040600020600091509050806000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105e65780601f106105bb576101008083540402835291602001916105e6565b820191906000526020600020905b8154815290600101906020018083116105c957829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156106845780601f1061065957610100808354040283529160200191610684565b820191906000526020600020905b81548152906001019060200180831161066757829003601f168201915b5050505050905082565b60005481565b60038280516020810182018051848252602083016020850120818352809550505050505081805160208101820180518482526020830160208501208183528095505050505050600091509150505481565b6000806003836040516106f89190610a67565b90815260200160405180910390209050600084828760405161071a9190610a67565b90815260200160405180910390205410156107355784610754565b81866040516107449190610a67565b9081526020016040518091039020545b90508082876040516107669190610a67565b908152602001604051809103902081905550603c82876040516107899190610a67565b90815260200160405180910390205410156107a9576000925050506107b0565b6001925050505b9392505050565b828054600181600116156101000203166002900490600052602060002090601f0160209004810192826107ed5760008555610834565b82601f1061080657805160ff1916838001178555610834565b82800160010185558215610834579182015b82811115610833578251825591602001919060010190610818565b5b5090506108419190610845565b5090565b5b8082111561085e576000816000905550600101610846565b5090565b600082601f83011261087357600080fd5b813561088661088182610b1c565b610aeb565b915080825260208301602083018583830111156108a257600080fd5b6108ad838284610b89565b50505092915050565b6000813590506108c581610bde565b92915050565b600080604083850312156108de57600080fd5b600083013567ffffffffffffffff8111156108f857600080fd5b61090485828601610862565b925050602083013567ffffffffffffffff81111561092157600080fd5b61092d85828601610862565b9150509250929050565b60008060006060848603121561094c57600080fd5b600084013567ffffffffffffffff81111561096657600080fd5b61097286828701610862565b9350506020610983868287016108b6565b925050604084013567ffffffffffffffff8111156109a057600080fd5b6109ac86828701610862565b9150509250925092565b6000602082840312156109c857600080fd5b60006109d6848285016108b6565b91505092915050565b6109e881610b73565b82525050565b60006109f982610b4c565b610a038185610b57565b9350610a13818560208601610b98565b610a1c81610bcd565b840191505092915050565b6000610a3282610b4c565b610a3c8185610b68565b9350610a4c818560208601610b98565b80840191505092915050565b610a6181610b7f565b82525050565b6000610a738284610a27565b915081905092915050565b6000602082019050610a9360008301846109df565b92915050565b60006040820190508181036000830152610ab381856109ee565b90508181036020830152610ac781846109ee565b90509392505050565b6000602082019050610ae56000830184610a58565b92915050565b6000604051905081810181811067ffffffffffffffff82111715610b1257610b11610bcb565b5b8060405250919050565b600067ffffffffffffffff821115610b3757610b36610bcb565b5b601f19601f8301169050602081019050919050565b600081519050919050565b600082825260208201905092915050565b600081905092915050565b60008115159050919050565b6000819050919050565b82818337600083830152505050565b60005b83811015610bb6578082015181840152602081019050610b9b565b83811115610bc5576000848401525b50505050565bfe5b6000601f19601f8301169050919050565b610be781610b7f565b8114610bf257600080fd5b5056fea2646970667358221220450ebc51b31ea1e9fb6e090f90ec97efe2da7e0f820565dcd68fee1decd3df6964736f6c63430007040033\",\n"
            + "\t\"opcodes\": \"PUSH1 0x80 PUSH1 0x40 MSTORE PUSH1 0x0 DUP1 SSTORE CALLVALUE DUP1 ISZERO PUSH2 0x14 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH2 0xC2B DUP1 PUSH2 0x24 PUSH1 0x0 CODECOPY PUSH1 0x0 RETURN INVALID PUSH1 0x80 PUSH1 0x40 MSTORE CALLVALUE DUP1 ISZERO PUSH2 0x10 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH1 0x4 CALLDATASIZE LT PUSH2 0x93 JUMPI PUSH1 0x0 CALLDATALOAD PUSH1 0xE0 SHR DUP1 PUSH4 0x680F20A1 GT PUSH2 0x66 JUMPI DUP1 PUSH4 0x680F20A1 EQ PUSH2 0x158 JUMPI DUP1 PUSH4 0x9982CDB6 EQ PUSH2 0x174 JUMPI DUP1 PUSH4 0xB500CE9D EQ PUSH2 0x1A5 JUMPI DUP1 PUSH4 0xD7920B38 EQ PUSH2 0x1C3 JUMPI DUP1 PUSH4 0xE314BD3D EQ PUSH2 0x1F3 JUMPI PUSH2 0x93 JUMP JUMPDEST DUP1 PUSH4 0x119E291D EQ PUSH2 0x98 JUMPI DUP1 PUSH4 0x3F20B1F1 EQ PUSH2 0xC8 JUMPI DUP1 PUSH4 0x4A02E977 EQ PUSH2 0xF8 JUMPI DUP1 PUSH4 0x4DF86BF1 EQ PUSH2 0x128 JUMPI JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0xB2 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0xAD SWAP2 SWAP1 PUSH2 0x8CB JUMP JUMPDEST PUSH2 0x223 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0xBF SWAP2 SWAP1 PUSH2 0xAD0 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0xE2 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0xDD SWAP2 SWAP1 PUSH2 0x8CB JUMP JUMPDEST PUSH2 0x274 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0xEF SWAP2 SWAP1 PUSH2 0xAD0 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x112 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x10D SWAP2 SWAP1 PUSH2 0x937 JUMP JUMPDEST PUSH2 0x2C5 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x11F SWAP2 SWAP1 PUSH2 0xA7E JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x142 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x13D SWAP2 SWAP1 PUSH2 0x937 JUMP JUMPDEST PUSH2 0x397 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x14F SWAP2 SWAP1 PUSH2 0xA7E JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x172 PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x16D SWAP2 SWAP1 PUSH2 0x8CB JUMP JUMPDEST PUSH2 0x469 JUMP JUMPDEST STOP JUMPDEST PUSH2 0x18E PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x189 SWAP2 SWAP1 PUSH2 0x9B6 JUMP JUMPDEST PUSH2 0x53A JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x19C SWAP3 SWAP2 SWAP1 PUSH2 0xA99 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x1AD PUSH2 0x68E JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x1BA SWAP2 SWAP1 PUSH2 0xAD0 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x1DD PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x1D8 SWAP2 SWAP1 PUSH2 0x8CB JUMP JUMPDEST PUSH2 0x694 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x1EA SWAP2 SWAP1 PUSH2 0xAD0 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x20D PUSH1 0x4 DUP1 CALLDATASIZE SUB DUP2 ADD SWAP1 PUSH2 0x208 SWAP2 SWAP1 PUSH2 0x937 JUMP JUMPDEST PUSH2 0x6E5 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x21A SWAP2 SWAP1 PUSH2 0xA7E JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH1 0x1 DUP3 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP DUP2 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP PUSH1 0x0 SWAP2 POP SWAP2 POP POP SLOAD DUP2 JUMP JUMPDEST PUSH1 0x2 DUP3 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP DUP2 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP PUSH1 0x0 SWAP2 POP SWAP2 POP POP SLOAD DUP2 JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x1 DUP4 PUSH1 0x40 MLOAD PUSH2 0x2D8 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SWAP1 POP PUSH1 0x0 DUP5 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x2FA SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x315 JUMPI DUP5 PUSH2 0x334 JUMP JUMPDEST DUP2 DUP7 PUSH1 0x40 MLOAD PUSH2 0x324 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD JUMPDEST SWAP1 POP DUP1 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x346 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 DUP2 SWAP1 SSTORE POP PUSH1 0x3C DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x369 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x389 JUMPI PUSH1 0x0 SWAP3 POP POP POP PUSH2 0x390 JUMP JUMPDEST PUSH1 0x1 SWAP3 POP POP POP JUMPDEST SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x2 DUP4 PUSH1 0x40 MLOAD PUSH2 0x3AA SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SWAP1 POP PUSH1 0x0 DUP5 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x3CC SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x3E7 JUMPI DUP5 PUSH2 0x406 JUMP JUMPDEST DUP2 DUP7 PUSH1 0x40 MLOAD PUSH2 0x3F6 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD JUMPDEST SWAP1 POP DUP1 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x418 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 DUP2 SWAP1 SSTORE POP PUSH1 0x3C DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x43B SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x45B JUMPI PUSH1 0x0 SWAP3 POP POP POP PUSH2 0x462 JUMP JUMPDEST PUSH1 0x1 SWAP3 POP POP POP JUMPDEST SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x0 DUP3 MLOAD GT PUSH2 0x477 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP2 MLOAD GT PUSH2 0x485 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND CALLER PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND EQ ISZERO PUSH2 0x4BF JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP1 DUP2 SLOAD DUP1 SWAP3 SWAP2 SWAP1 PUSH1 0x1 ADD SWAP2 SWAP1 POP SSTORE POP PUSH1 0x40 MLOAD DUP1 PUSH1 0x40 ADD PUSH1 0x40 MSTORE DUP1 DUP4 DUP2 MSTORE PUSH1 0x20 ADD DUP3 DUP2 MSTORE POP PUSH1 0x4 PUSH1 0x0 DUP1 SLOAD DUP2 MSTORE PUSH1 0x20 ADD SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x0 KECCAK256 PUSH1 0x0 DUP3 ADD MLOAD DUP2 PUSH1 0x0 ADD SWAP1 DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH2 0x515 SWAP3 SWAP2 SWAP1 PUSH2 0x7B7 JUMP JUMPDEST POP PUSH1 0x20 DUP3 ADD MLOAD DUP2 PUSH1 0x1 ADD SWAP1 DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH2 0x532 SWAP3 SWAP2 SWAP1 PUSH2 0x7B7 JUMP JUMPDEST POP SWAP1 POP POP POP POP JUMP JUMPDEST PUSH1 0x4 PUSH1 0x20 MSTORE DUP1 PUSH1 0x0 MSTORE PUSH1 0x40 PUSH1 0x0 KECCAK256 PUSH1 0x0 SWAP2 POP SWAP1 POP DUP1 PUSH1 0x0 ADD DUP1 SLOAD PUSH1 0x1 DUP2 PUSH1 0x1 AND ISZERO PUSH2 0x100 MUL SUB AND PUSH1 0x2 SWAP1 DIV DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP3 DUP1 SLOAD PUSH1 0x1 DUP2 PUSH1 0x1 AND ISZERO PUSH2 0x100 MUL SUB AND PUSH1 0x2 SWAP1 DIV DUP1 ISZERO PUSH2 0x5E6 JUMPI DUP1 PUSH1 0x1F LT PUSH2 0x5BB JUMPI PUSH2 0x100 DUP1 DUP4 SLOAD DIV MUL DUP4 MSTORE SWAP2 PUSH1 0x20 ADD SWAP2 PUSH2 0x5E6 JUMP JUMPDEST DUP3 ADD SWAP2 SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 SWAP1 JUMPDEST DUP2 SLOAD DUP2 MSTORE SWAP1 PUSH1 0x1 ADD SWAP1 PUSH1 0x20 ADD DUP1 DUP4 GT PUSH2 0x5C9 JUMPI DUP3 SWAP1 SUB PUSH1 0x1F AND DUP3 ADD SWAP2 JUMPDEST POP POP POP POP POP SWAP1 DUP1 PUSH1 0x1 ADD DUP1 SLOAD PUSH1 0x1 DUP2 PUSH1 0x1 AND ISZERO PUSH2 0x100 MUL SUB AND PUSH1 0x2 SWAP1 DIV DUP1 PUSH1 0x1F ADD PUSH1 0x20 DUP1 SWAP2 DIV MUL PUSH1 0x20 ADD PUSH1 0x40 MLOAD SWAP1 DUP2 ADD PUSH1 0x40 MSTORE DUP1 SWAP3 SWAP2 SWAP1 DUP2 DUP2 MSTORE PUSH1 0x20 ADD DUP3 DUP1 SLOAD PUSH1 0x1 DUP2 PUSH1 0x1 AND ISZERO PUSH2 0x100 MUL SUB AND PUSH1 0x2 SWAP1 DIV DUP1 ISZERO PUSH2 0x684 JUMPI DUP1 PUSH1 0x1F LT PUSH2 0x659 JUMPI PUSH2 0x100 DUP1 DUP4 SLOAD DIV MUL DUP4 MSTORE SWAP2 PUSH1 0x20 ADD SWAP2 PUSH2 0x684 JUMP JUMPDEST DUP3 ADD SWAP2 SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 SWAP1 JUMPDEST DUP2 SLOAD DUP2 MSTORE SWAP1 PUSH1 0x1 ADD SWAP1 PUSH1 0x20 ADD DUP1 DUP4 GT PUSH2 0x667 JUMPI DUP3 SWAP1 SUB PUSH1 0x1F AND DUP3 ADD SWAP2 JUMPDEST POP POP POP POP POP SWAP1 POP DUP3 JUMP JUMPDEST PUSH1 0x0 SLOAD DUP2 JUMP JUMPDEST PUSH1 0x3 DUP3 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP DUP2 DUP1 MLOAD PUSH1 0x20 DUP2 ADD DUP3 ADD DUP1 MLOAD DUP5 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP6 ADD KECCAK256 DUP2 DUP4 MSTORE DUP1 SWAP6 POP POP POP POP POP POP PUSH1 0x0 SWAP2 POP SWAP2 POP POP SLOAD DUP2 JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x3 DUP4 PUSH1 0x40 MLOAD PUSH2 0x6F8 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SWAP1 POP PUSH1 0x0 DUP5 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x71A SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x735 JUMPI DUP5 PUSH2 0x754 JUMP JUMPDEST DUP2 DUP7 PUSH1 0x40 MLOAD PUSH2 0x744 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD JUMPDEST SWAP1 POP DUP1 DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x766 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 DUP2 SWAP1 SSTORE POP PUSH1 0x3C DUP3 DUP8 PUSH1 0x40 MLOAD PUSH2 0x789 SWAP2 SWAP1 PUSH2 0xA67 JUMP JUMPDEST SWAP1 DUP2 MSTORE PUSH1 0x20 ADD PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 KECCAK256 SLOAD LT ISZERO PUSH2 0x7A9 JUMPI PUSH1 0x0 SWAP3 POP POP POP PUSH2 0x7B0 JUMP JUMPDEST PUSH1 0x1 SWAP3 POP POP POP JUMPDEST SWAP4 SWAP3 POP POP POP JUMP JUMPDEST DUP3 DUP1 SLOAD PUSH1 0x1 DUP2 PUSH1 0x1 AND ISZERO PUSH2 0x100 MUL SUB AND PUSH1 0x2 SWAP1 DIV SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 SWAP1 PUSH1 0x1F ADD PUSH1 0x20 SWAP1 DIV DUP2 ADD SWAP3 DUP3 PUSH2 0x7ED JUMPI PUSH1 0x0 DUP6 SSTORE PUSH2 0x834 JUMP JUMPDEST DUP3 PUSH1 0x1F LT PUSH2 0x806 JUMPI DUP1 MLOAD PUSH1 0xFF NOT AND DUP4 DUP1 ADD OR DUP6 SSTORE PUSH2 0x834 JUMP JUMPDEST DUP3 DUP1 ADD PUSH1 0x1 ADD DUP6 SSTORE DUP3 ISZERO PUSH2 0x834 JUMPI SWAP2 DUP3 ADD JUMPDEST DUP3 DUP2 GT ISZERO PUSH2 0x833 JUMPI DUP3 MLOAD DUP3 SSTORE SWAP2 PUSH1 0x20 ADD SWAP2 SWAP1 PUSH1 0x1 ADD SWAP1 PUSH2 0x818 JUMP JUMPDEST JUMPDEST POP SWAP1 POP PUSH2 0x841 SWAP2 SWAP1 PUSH2 0x845 JUMP JUMPDEST POP SWAP1 JUMP JUMPDEST JUMPDEST DUP1 DUP3 GT ISZERO PUSH2 0x85E JUMPI PUSH1 0x0 DUP2 PUSH1 0x0 SWAP1 SSTORE POP PUSH1 0x1 ADD PUSH2 0x846 JUMP JUMPDEST POP SWAP1 JUMP JUMPDEST PUSH1 0x0 DUP3 PUSH1 0x1F DUP4 ADD SLT PUSH2 0x873 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST DUP2 CALLDATALOAD PUSH2 0x886 PUSH2 0x881 DUP3 PUSH2 0xB1C JUMP JUMPDEST PUSH2 0xAEB JUMP JUMPDEST SWAP2 POP DUP1 DUP3 MSTORE PUSH1 0x20 DUP4 ADD PUSH1 0x20 DUP4 ADD DUP6 DUP4 DUP4 ADD GT ISZERO PUSH2 0x8A2 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x8AD DUP4 DUP3 DUP5 PUSH2 0xB89 JUMP JUMPDEST POP POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 DUP2 CALLDATALOAD SWAP1 POP PUSH2 0x8C5 DUP2 PUSH2 0xBDE JUMP JUMPDEST SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x40 DUP4 DUP6 SUB SLT ISZERO PUSH2 0x8DE JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP4 ADD CALLDATALOAD PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x8F8 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x904 DUP6 DUP3 DUP7 ADD PUSH2 0x862 JUMP JUMPDEST SWAP3 POP POP PUSH1 0x20 DUP4 ADD CALLDATALOAD PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x921 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x92D DUP6 DUP3 DUP7 ADD PUSH2 0x862 JUMP JUMPDEST SWAP2 POP POP SWAP3 POP SWAP3 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x0 PUSH1 0x60 DUP5 DUP7 SUB SLT ISZERO PUSH2 0x94C JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP5 ADD CALLDATALOAD PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x966 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x972 DUP7 DUP3 DUP8 ADD PUSH2 0x862 JUMP JUMPDEST SWAP4 POP POP PUSH1 0x20 PUSH2 0x983 DUP7 DUP3 DUP8 ADD PUSH2 0x8B6 JUMP JUMPDEST SWAP3 POP POP PUSH1 0x40 DUP5 ADD CALLDATALOAD PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x9A0 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x9AC DUP7 DUP3 DUP8 ADD PUSH2 0x862 JUMP JUMPDEST SWAP2 POP POP SWAP3 POP SWAP3 POP SWAP3 JUMP JUMPDEST PUSH1 0x0 PUSH1 0x20 DUP3 DUP5 SUB SLT ISZERO PUSH2 0x9C8 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 PUSH2 0x9D6 DUP5 DUP3 DUP6 ADD PUSH2 0x8B6 JUMP JUMPDEST SWAP2 POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH2 0x9E8 DUP2 PUSH2 0xB73 JUMP JUMPDEST DUP3 MSTORE POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x9F9 DUP3 PUSH2 0xB4C JUMP JUMPDEST PUSH2 0xA03 DUP2 DUP6 PUSH2 0xB57 JUMP JUMPDEST SWAP4 POP PUSH2 0xA13 DUP2 DUP6 PUSH1 0x20 DUP7 ADD PUSH2 0xB98 JUMP JUMPDEST PUSH2 0xA1C DUP2 PUSH2 0xBCD JUMP JUMPDEST DUP5 ADD SWAP2 POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0xA32 DUP3 PUSH2 0xB4C JUMP JUMPDEST PUSH2 0xA3C DUP2 DUP6 PUSH2 0xB68 JUMP JUMPDEST SWAP4 POP PUSH2 0xA4C DUP2 DUP6 PUSH1 0x20 DUP7 ADD PUSH2 0xB98 JUMP JUMPDEST DUP1 DUP5 ADD SWAP2 POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH2 0xA61 DUP2 PUSH2 0xB7F JUMP JUMPDEST DUP3 MSTORE POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0xA73 DUP3 DUP5 PUSH2 0xA27 JUMP JUMPDEST SWAP2 POP DUP2 SWAP1 POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x20 DUP3 ADD SWAP1 POP PUSH2 0xA93 PUSH1 0x0 DUP4 ADD DUP5 PUSH2 0x9DF JUMP JUMPDEST SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 DUP3 ADD SWAP1 POP DUP2 DUP2 SUB PUSH1 0x0 DUP4 ADD MSTORE PUSH2 0xAB3 DUP2 DUP6 PUSH2 0x9EE JUMP JUMPDEST SWAP1 POP DUP2 DUP2 SUB PUSH1 0x20 DUP4 ADD MSTORE PUSH2 0xAC7 DUP2 DUP5 PUSH2 0x9EE JUMP JUMPDEST SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x20 DUP3 ADD SWAP1 POP PUSH2 0xAE5 PUSH1 0x0 DUP4 ADD DUP5 PUSH2 0xA58 JUMP JUMPDEST SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 MLOAD SWAP1 POP DUP2 DUP2 ADD DUP2 DUP2 LT PUSH8 0xFFFFFFFFFFFFFFFF DUP3 GT OR ISZERO PUSH2 0xB12 JUMPI PUSH2 0xB11 PUSH2 0xBCB JUMP JUMPDEST JUMPDEST DUP1 PUSH1 0x40 MSTORE POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH8 0xFFFFFFFFFFFFFFFF DUP3 GT ISZERO PUSH2 0xB37 JUMPI PUSH2 0xB36 PUSH2 0xBCB JUMP JUMPDEST JUMPDEST PUSH1 0x1F NOT PUSH1 0x1F DUP4 ADD AND SWAP1 POP PUSH1 0x20 DUP2 ADD SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 MLOAD SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP3 DUP3 MSTORE PUSH1 0x20 DUP3 ADD SWAP1 POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 DUP2 SWAP1 POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 DUP2 ISZERO ISZERO SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST DUP3 DUP2 DUP4 CALLDATACOPY PUSH1 0x0 DUP4 DUP4 ADD MSTORE POP POP POP JUMP JUMPDEST PUSH1 0x0 JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0xBB6 JUMPI DUP1 DUP3 ADD MLOAD DUP2 DUP5 ADD MSTORE PUSH1 0x20 DUP2 ADD SWAP1 POP PUSH2 0xB9B JUMP JUMPDEST DUP4 DUP2 GT ISZERO PUSH2 0xBC5 JUMPI PUSH1 0x0 DUP5 DUP5 ADD MSTORE JUMPDEST POP POP POP POP JUMP JUMPDEST INVALID JUMPDEST PUSH1 0x0 PUSH1 0x1F NOT PUSH1 0x1F DUP4 ADD AND SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH2 0xBE7 DUP2 PUSH2 0xB7F JUMP JUMPDEST DUP2 EQ PUSH2 0xBF2 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP JUMP INVALID LOG2 PUSH5 0x6970667358 0x22 SLT KECCAK256 GASLIMIT 0xE 0xBC MLOAD 0xB3 0x1E LOG1 0xE9 0xFB PUSH15 0x90F90EC97EFE2DA7E0F820565DCD6 DUP16 0xEE SAR 0xEC 0xD3 0xDF PUSH10 0x64736F6C634300070400 CALLER \",\n"
            + "\t\"sourceMap\": \"105:2885:0:-:0;;;637:1;614:24;;105:2885;;;;;;;;;;;;;;;;\"\n"
            + "}";

    public static final String FUNC_CANGRADUATE_MA = "canGraduate_MA";

    public static final String FUNC_CANGRADUATE_PH = "canGraduate_PH";

    public static final String FUNC_CANGRADUATE_UN = "canGraduate_UN";

    public static final String FUNC_CREATEGRADUATE = "createGraduate";

    public static final String FUNC_CERCOUNT = "cerCount";

    public static final String FUNC_CERS = "cers";

    public static final String FUNC_MAGRADES = "MAgrades";

    public static final String FUNC_PHGRADES = "PHgrades";

    public static final String FUNC_UNGRADES = "UNgrades";

    @Deprecated
    protected Graduate(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Graduate(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Graduate(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Graduate(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Bool> canGraduate_MA(String _courseNum, int _score, String _identityNum) {
        final Function function = new Function(
                FUNC_CANGRADUATE_MA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_courseNum), 
                new org.web3j.abi.datatypes.generated.Uint256(_score), 
                new org.web3j.abi.datatypes.Utf8String(_identityNum)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteFunctionCall<Bool> canGraduate_PH(String _courseNum, int _score, String _identityNum) {
        final Function function = new Function(
                FUNC_CANGRADUATE_PH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_courseNum), 
                new org.web3j.abi.datatypes.generated.Uint256(_score), 
                new org.web3j.abi.datatypes.Utf8String(_identityNum)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteFunctionCall<Bool> canGraduate_UN(String _courseNum, int _score, String _identityNum) {
        final Function function = new Function(
                FUNC_CANGRADUATE_UN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_courseNum), 
                new org.web3j.abi.datatypes.generated.Uint256(_score), 
                new org.web3j.abi.datatypes.Utf8String(_identityNum)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteFunctionCall<TransactionReceipt> createGraduate(String _data, String _certificateNum) {
        final Function function = new Function(
                FUNC_CREATEGRADUATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_data), 
                new org.web3j.abi.datatypes.Utf8String(_certificateNum)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Uint256> cerCount() {
        final Function function = new Function(
                FUNC_CERCOUNT, 
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {
                }));
        return executeRemoteCallSingleValueReturn(function);

    }

    public RemoteFunctionCall<List<Type>> cers(int param0) {
        final Function function = new Function(
                FUNC_CERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList( new TypeReference<Utf8String>() {
                },new TypeReference<Utf8String>() {
                }));
        return executeRemoteCallMultipleValueReturn(function);
    }

    public RemoteFunctionCall<TransactionReceipt> MAgrades(String param0, String param1) {
        final Function function = new Function(
                FUNC_MAGRADES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0), 
                new org.web3j.abi.datatypes.Utf8String(param1)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> PHgrades(String param0, String param1) {
        final Function function = new Function(
                FUNC_PHGRADES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0), 
                new org.web3j.abi.datatypes.Utf8String(param1)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> UNgrades(String param0, String param1) {
        final Function function = new Function(
                FUNC_UNGRADES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0), 
                new org.web3j.abi.datatypes.Utf8String(param1)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Graduate load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Graduate(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Graduate load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Graduate(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Graduate load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Graduate(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Graduate load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Graduate(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Graduate> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Graduate.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Graduate> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Graduate.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Graduate> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Graduate.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Graduate> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Graduate.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}

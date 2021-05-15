package com.craftinginterpreters.lox;

class Token {
    final TokenType type;
    // Lexeme = blob of characters that represent *something*
    // Ex: var is a lexeme
    final String lexeme;
    final Object literal;
    final int line;
    
    Token(TokenType type, String lexeme, Object literal, int line) {
       this.type = type;
       this.lexeme = lexeme; 
       this.literal = literal;
       this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
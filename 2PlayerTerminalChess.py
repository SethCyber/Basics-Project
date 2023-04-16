import chess
board = chess.Board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1")


def terminal_move():
    global pawn_promotion, entry
    pawn_promotion = False
    if board.is_game_over():
        print("Game Over")
        while 1==1:
            input()
    else:
        legal_moves = [board.san(move) for move in board.legal_moves]
        if len(legal_moves) == 0:
            if board.is_checkmate():
                print('Mate!')
            elif board.is_stalemate():
                if board.has_insufficient_material(board.turn):
                    print('Draw: Insufficient material')
                else:
                    print('Stalemate!')
        else:
            legal_moves = [board.san(move) for move in board.legal_moves]
            if board.is_check():
                king_square = board.king(board.turn)
                legal_moves = [move for move in legal_moves if str(king_square) in move]
            if board.has_castling_rights(board.turn):
                if board.has_kingside_castling_rights(board.turn):
                    legal_moves.append('O-O')
                if board.has_queenside_castling_rights(board.turn):
                    legal_moves.append('O-O-O')
            print(board)
            entry = input("SAN Move:")
            try:
                move = chess.Move.from_uci(entry)
                if move in board.legal_moves:
                    board.push(move)
                else:
                    print('Illegal move')
                    return terminal_move()
            except ValueError:
                try:
                    board.push_san(entry)
                except ValueError:
                    print('Illegal move')
                    return terminal_move()
        if board.is_checkmate():
            print('Mate!')
        elif board.is_stalemate():
            print('Stalemate!')
        elif board.has_insufficient_material(board.turn):
            print('Draw: Insufficient material')
while 1==1:
    terminal_move()
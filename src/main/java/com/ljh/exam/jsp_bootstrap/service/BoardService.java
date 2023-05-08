package com.ljh.exam.jsp_bootstrap.service;

import org.springframework.stereotype.Service;

import com.ljh.exam.jsp_bootstrap.repository.BoardRepository;
import com.ljh.exam.jsp_bootstrap.vo.Board;

@Service
public class BoardService {
	
	private BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	public Board getBoardById(int id) {
		return boardRepository.getBoardById(id);
	}
}

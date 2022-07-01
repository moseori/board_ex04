package me.light.mapper;

import java.util.List;

import me.light.model.BoardAttachVO;

public interface BoardAttachMapper {

	void insert(BoardAttachVO vo);

	void delete(String uuid);

	List<BoardAttachVO> findByBno(Long bno);
}
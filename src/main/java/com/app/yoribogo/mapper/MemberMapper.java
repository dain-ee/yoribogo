package com.app.yoribogo.mapper;

import com.app.yoribogo.domain.MemberDTO;
import com.app.yoribogo.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    // 회원가입
    public void insert(MemberVO memberVO);

    //로그인
    public Optional<MemberVO> selectByLogin(MemberVO memberVO);

    // 이메일 찾기
    public Optional<MemberVO> selectByEmail(MemberVO memberVO);

    //비밀번호 변경
    public void update(@Param("memberEmail") String memberEmail, @Param("memberPassword") String memberPassword);

    //    카카오 회원 정보 조회
    public Optional<MemberVO> selectKaKao(String memberKakaoEmail);

    //    카카오 프사 수정
    public void updateKaKaoProfile(MemberVO memberVO);

    //    카카오 연동하기
    public void updateBySync(MemberVO memberVO);

    //    회원 삭제
    public void delete(Long id);

    //카카오이메일 찾기
    public List<MemberVO> kakaEmail();

    //게시글 업데이트
    public void updateALL(Long oldMemberId, Long newMemberId);

    //memberID로 된거 다업데이트
    public void updatePurchase(Long oldMemberId, Long newMemberId);

    public void updateLike(Long oldMemberId, Long newMemberId);

    public void updateComment(Long oldMemberId, Long newMemberId);

    //회원 게시글 조인 조회
    public List<MemberDTO> select(Long id);

    //회원정보 조회
    public Optional<MemberVO> selectIdJoin(Long id);
}
package chapter4.part7.web;

import chapter4.part7.domain.Member;
import chapter4.part7.domain.Members;
import chapter4.part7.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestMemberController {
	private final MemberService memberService;

	@Autowired
	public RestMemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}

	@RequestMapping(value = "/members")
	@ResponseBody
	public Members getRestMembers(Model model) {
		Members members = new Members();
		members.addMembers(memberService.findAll());
		return members;
	}

	@RequestMapping("/member/{memberid}")
	@ResponseBody
	public ResponseEntity<Member> getMember(@PathVariable("memberid") long memberID) {
		Member member = memberService.find(memberID);
		if (member != null) {
			return new ResponseEntity<Member>(member, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

}
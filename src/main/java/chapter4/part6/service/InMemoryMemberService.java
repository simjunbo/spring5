package chapter4.part6.service;

import chapter4.part6.domain.Member;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
class InMemoryMemberService implements MemberService {

	private final Map<Long, Member> members = new HashMap<>();

	@PostConstruct
	public void init() {
		Member m1 = new Member();
		m1.setName("Marten Deinum");
		m1.setEmail("marten@deinum.biz");
		m1.setPhone("00-31-1234567890");

		Member m2 = new Member();
		m2.setName("John Doe");
		m2.setPhone("1-800-800-800");
		m2.setEmail("john@doe.com");

		Member m3 = new Member();
		m3.setName("Jane Doe");
		m3.setPhone("1-801-802-803");
		m3.setEmail("jane@doe.com");

		members.put(1L, m1);
		members.put(2L, m2);
		members.put(3L, m3);
	}

	@Override
	public java.util.Collection<Member> findAll() {
		return members.values();
	}

	@Override
	public Member find(long id) {
		return members.get(id);
	}
}

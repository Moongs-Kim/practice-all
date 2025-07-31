package javamid2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }
    public void remove(String id) {
        memberMap.remove(id);
    }
    public Member findById(String id) {
        if (memberMap.containsKey(id)) {
            return memberMap.get(id);
        }
        return null;
    }
    public Member findByName(String name) {
        Set<Map.Entry<String, Member>> members = memberMap.entrySet();
        for (Map.Entry<String, Member> member : members) {
            if (member.getValue().getName().equals(name)) {
                return member.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MemberRepository{" +
                "memberMap=" + memberMap +
                '}';
    }
}

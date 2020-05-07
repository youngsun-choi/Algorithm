package programmers.level2.day04;

public class SkillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        SkillTree skillTree = new SkillTree();
        System.out.println(skillTree.skill(skill, skill_trees));
        System.out.println(skillTree.skill2(skill, skill_trees));
    }
    public int skill(String skill, String[] skill_trees) {
        boolean flag;
        String[] skills;
        int cnt, index, answer = 0;
        String str = "";

        for(int i=0; i<skill_trees.length; i++) {
            flag = true;
            skills = skill_trees[i].split("");
            cnt = 0;

            for(int j=0; j<skills.length; j++) {
                str = skills[j];
                index = skill.indexOf(str);
                if(cnt == index) {
                    cnt++;
                }else if(cnt < index) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }
        return answer;
    }
    public int skill2(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for(int i=0; i<skill_trees.length; i++) {
            if(skill.indexOf(skill_trees[i].replaceAll("[^"+skill+"]","")) != 0) {
                answer--;
            }
        }
        return answer;
    }
}

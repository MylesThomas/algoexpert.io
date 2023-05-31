-- Populate data.

-- Company
CREATE (facebook:Company {name:'Facebook'})
-- Candidates
CREATE (clement:Candidate {name:'Clement'})
CREATE (antoine:Candidate {name:'Antoine'})
CREATE (simon:Candidate {name:'Simon'})
-- Interviewers
CREATE (alex:Interviewer {name:'Alex'})
CREATE (meghan:Interviewer {name:'Meghan'})
CREATE (marli:Interviewer {name:'Marli'})
CREATE (sandeep:Interviewer {name:'Sandeep'})
CREATE (molly:Interviewer {name:'Molly'})
CREATE (akshay:Interviewer {name:'Akshay'})
CREATE (aditya:Interviewer {name:'Aditya'})
CREATE (brandon:Interviewer {name:'Brandon'})
CREATE (pedro:Interviewer {name:'Pedro'})
CREATE (ryan:Interviewer {name:'Ryan'})
CREATE (xi:Interviewer {name:'Xi'})
CREATE (simran:Interviewer {name:'Simran'})
CREATE (amanda:Interviewer {name:'Amanda'})
-- Add 'score' between Interviewers/Candidates
CREATE (alex)-[:INTERVIEWED {score: 'passed'}]->(clement)
CREATE (meghan)-[:INTERVIEWED {score: 'passed'}]->(clement)
CREATE (simran)-[:INTERVIEWED {score: 'passed'}]->(clement)
CREATE (molly)-[:INTERVIEWED {score: 'failed'}]->(clement)
CREATE (marli)-[:INTERVIEWED {score: 'failed'}]->(antoine)
CREATE (akshay)-[:INTERVIEWED {score: 'passed'}]->(antoine)
CREATE (aditya)-[:INTERVIEWED {score: 'passed'}]->(antoine)
CREATE (meghan)-[:INTERVIEWED {score: 'passed'}]->(antoine)
CREATE (marli)-[:INTERVIEWED {score: 'failed'}]->(simon)
CREATE (meghan)-[:INTERVIEWED {score: 'failed'}]->(simon)
CREATE (brandon)-[:INTERVIEWED {score: 'passed'}]->(simon)
CREATE (xi)-[:INTERVIEWED {score: 'failed'}]->(simon)

-- Add 'status' between Candidates/Company
CREATE (ryan)-[:APPLIED {status: 'rejected'}]->(facebook)
CREATE (simran)-[:APPLIED {status: 'accepted'}]->(facebook)
CREATE (xi)-[:APPLIED {status: 'rejected'}]->(facebook)
CREATE (molly)-[:APPLIED {status: 'rejected'}]->(facebook)
CREATE (alex)-[:APPLIED {status: 'rejected'}]->(facebook)


-- Find the interviewers who did the following: 
-- 1. Interviewed and failed Clement
-- 2. Applied and got rejected by Facebook

-- simple query !
MATCH (interviewer: Interviewer)-[:INTERVIEWED {score:'failed'}]->(:Candidate {name:'Clement'})
WHERE (interviewer)-[:APPLIED {status:'rejected'}]->(:Company {name:'Facebook'})
RETURN interviewer.name;
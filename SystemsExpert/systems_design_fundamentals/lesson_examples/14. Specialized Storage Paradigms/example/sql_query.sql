-- Why don't we use SQL???

-- Complicated to write the query
-- Tough to reason about 
-- Computationally expensive

--
SELECT interviewers.name
FROM (
    candidates
    JOIN interviews ON (candidates.id = interviews.candidate_id AND candidates.name = 'Clement' AND interviews.score = 'failed')
    JOIN interviewers ON (interviewers.id = interviews.interviewer_id)
)

WHERE EXISTS (
    SELECT *
    FROM applications
    WHERE company = 'Facebook' AND candidate_id = interviewers.id AND status = 'rejected'
)
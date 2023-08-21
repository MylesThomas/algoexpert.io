import { createContext, useState } from "react"

export const UserContext = createContext({
    // create the context (best practice to follow this format, even if we don't use the defaults)
    toggleUser: null,
    user: {
        name: null,
        course: null
    }
});

const conner = {
    name: 'Conner',
    course: 'FrontendExpert', 
};
  
const clement = {
    name: 'Clement',
    course: 'AlgoExpert', 
};

export function UserContextProvider({children}) {
const [user, setUser] = useState(conner); 

  const toggleUser = () => {
    if (user === conner) {
      setUser(clement);
    } else {
      setUser(conner);
    }
  }
    
    return (
        <UserContext.Provider value={{
            user,
            toggleUser
        }}>
            {children}
        </UserContext.Provider>
    );
}
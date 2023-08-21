import Profile from './Profile';
import { UserContext, UserContextProvider } from './UserContext';
import { useContext } from 'react';

export default function App() {
  return (
    <main>
      <UserContextProvider>
        <AppInteral />
      </UserContextProvider>
    </main>
  );
}

function AppInteral() {
  const { toggleUser } = useContext(UserContext);
  return (
    <>
      <Profile />
      <button onClick={toggleUser}>Toggle User</button>
    </>
  );
}